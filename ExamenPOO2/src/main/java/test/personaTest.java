package test;

import data.empleadoDAO;
import data.clienteDAO;
import data.proveedorDAO;
import domain.empleado;
import domain.cliente;
import domain.proveedor;
import domain.persona;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class personaTest {
    static int opcionSQL = 0;
    static int menu;
    static int menuCat;
    
    //Variables de Persona
    static int id;
    static String nombre;
    static String apellidoP;
    static String apellidoM;
    static String email;
    static String telefono;
    static String fechaNac;
    static int edad;
    static String rfc;
    
    //Variables de Empleado
    static String NSS;
    static String curp;
    static String antiguedad;
    static String puesto;
    
    //Variables de Cliente
    static int diasCreditoCliente;
    static int metodosPago;
    static String tipoMetodosPago;
    static int tipoPersona;
    static String menuTipoPersona;
    
    //Variables de Proveedor
    static int diasEntrega;
    static int diasCreditoProveedor;
    static int categoria;
    static String tipoCategoria;
    
    public static boolean ValidarNombreApellidos(String datos){
        return datos.matches("[a-zA-Z]*");
    }
    
    public static boolean ValidarTelefono(String datos){
        return datos.matches("[0-9]{10}");
    }
    
    public static boolean ValidarEmail(String email) {
    return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+[.]+[A-Za-z]+$");
    }
    
    public static boolean ValidarFechaNac(String datos){
        return datos.matches("[0-9]{4}"+"/"+"[0-9]{2}"+"/"+"[0-9]{2}");
    }
    
    public static boolean ValidarEdad(String datos){
        return datos.matches("[0-9]{1,3}");
    }
    
    public static boolean ValidarRfc(String datos){
        return datos.matches("[A-Z0-9]{13}");
    }
    
    public static boolean ValidarNSS(String datos){
        return datos.matches("[0-9]{11}");
    }
    
    public static boolean ValidarCurp(String datos){
        return datos.matches("[A-Z0-9]{18}");
    }
    
    public static boolean ValidarAntiguedad(String datos){
        return datos.matches("[0-9]{1,3}");
    }
    
    public static boolean ValidarPuesto(String datos){
        return datos.matches("[a-zA-Z]*");
    }
    
    public static boolean ValidarDiasEntrega(String datos){
        return datos.matches("[0-9]*");
    }
    
    public static boolean ValidarDiasCredito(String datos){
        return datos.matches("[0-9]*");
    }
    
    public static boolean ValidarCategoria(String datos){
        return datos.matches("[1-5]{1}");
    }
    
    public static boolean ValidarMetodoPago(String datos){
        return datos.matches("[1-3]{1}");
    }
    
    public static boolean ValidarTipoPersona(String datos){
        return datos.matches("[1-2]{1}");
    }
       
    
    public static void Mostrarmenu(){
        try {
            Scanner sc = new Scanner(System.in);
            //menu = in.nextInt();
            System.out.println("Elige menú porfa \n1.- Empleado \n2.- Cliente \n3.- Proveedor \n4.- Salir");
            menu = Integer.parseInt(sc.nextLine());

            if(menu==1){
                MenuEmpleados();
            }

            else if(menu==2){
                MenuClientes();
            }

            else if(menu==3){
                MenuProveedores();
            }

            else if(menu==4){
                System.out.println("Gracias por su Visita");
            }
            else{
                System.out.println("******************************************************");
                System.out.println("Selecciona un número válido porfavor");
                Mostrarmenu();
            }
        } catch (Exception e) {
            System.out.println("******************************************************");
            System.out.println("Selecciona un valor válido porfavor");
            Mostrarmenu();
        }
    }
    
    public static void RegistroNombre(){
        try {
            System.out.println("Ingrese el nombre:");
            Scanner aa = new Scanner(System.in);
            nombre = aa.nextLine();
            if(!ValidarNombreApellidos(nombre)){
                System.out.println("\nIngresa caracteres de A-Z por favor");
                RegistroNombre();
            }
            else if(ValidarNombreApellidos(nombre)){
                System.out.println("Nombre valido");
            }
            
        } catch (Exception e) {
            System.out.println("Ingresa caracteres alfabeticos por favor");
        }
    }
    
    public static void RegistroApellidoP(){
        try {
            System.out.println("Ingrese el apellido Paterno:");
            Scanner bb = new Scanner(System.in);
            apellidoP = bb.nextLine();
            if(!ValidarNombreApellidos(apellidoP)){
                System.out.println("\nIngresa caracteres de A-Z por favor");
                RegistroApellidoP();
            }
            else if(ValidarNombreApellidos(apellidoP)){
                System.out.println("Apellido Paterno valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa caracteres alfabeticos por favor");
            RegistroApellidoP();
        }
    }
    
    public static void RegistroApellidoM(){
        try {
            System.out.println("Ingrese el apellido Materno:");
            Scanner cc = new Scanner(System.in);
            apellidoM = cc.nextLine();
            if(!ValidarNombreApellidos(apellidoM)){
                System.out.println("\nIngresa caracteres de A-Z por favor");
                RegistroApellidoM();
            }
            else if(ValidarNombreApellidos(apellidoM)){
                System.out.println("Apellido Materno valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa caracteres alfabeticos por favor");
            RegistroApellidoM();
        }
    }
    
    public static void RegistroEmail(){
        try {
            System.out.println("Ingrese el email:");
            Scanner dd = new Scanner(System.in);
            email = dd.nextLine();
            if(!ValidarEmail(email)){
                System.out.println("\nIngresa un email valido por favor");
                RegistroEmail();
            }
            else if(ValidarEmail(email)){
                System.out.println("email valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un email valido por favor");
            RegistroEmail();
        }
    }
    
    public static void RegistroTelefono(){
        try {
            System.out.println("Ingrese el teléfono (10 numeros):");
            Scanner ee = new Scanner(System.in);
            telefono = ee.nextLine();
            if(!ValidarTelefono(telefono)){
                System.out.println("\nIngresa un número de 10 digitos por favor");
                RegistroTelefono();
            }
            else if(ValidarTelefono(telefono)){
                System.out.println("teléfono valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un teléfono valido (10 numeros) por favor");
            RegistroTelefono();
        }
    }
    
    public static void RegistroFechaNac(){
        try {
            System.out.println("Ingrese la fecha de Nacimiento en el formato yyyy/mm/dd :");
            Scanner ff = new Scanner(System.in);
            fechaNac = ff.nextLine();
            if(!ValidarFechaNac(fechaNac)){
                System.out.println("\nIngresa una fecha de nacimiento valida (yyyy/mm/dd) por favor");
                RegistroFechaNac();
            }
            else if(ValidarFechaNac(fechaNac)){
                System.out.println("Fecha valida");
            }
        } catch (Exception e) {
            System.out.println("Ingresa una fecha de nacimiento valida (yyyy/mm/dd) por favor");
            RegistroFechaNac();
        }
    }
      
    /*
    public static void RegistroEdad(){
        try {
            System.out.println("Ingrese la edad:");
            Scanner gg = new Scanner(System.in);
            edad = Integer.parseInt(gg.nextLine());
            if(!ValidarEdad(Integer.toString(edad))){
                System.out.println("\nIngresa una edad por favor");
                RegistroEdad();
            }
            else if(ValidarEdad(Integer.toString(edad))){
                System.out.println("Edad valida");
            }
        } catch (Exception e) {
            System.out.println("Ingresa una edad por favor");
            RegistroEdad();
        }
    }
    
    public static void RegistroEdad(){
        try {
            Calendar fechaNacimiento = new GregorianCalendar(LocalDate.parse(fechaNac));
            Calendar fechaHoy = Calendar.getInstance();
            int anoNac = fechaNacimiento.get(Calendar.YEAR);
            int anoHoy = fechaHoy.get(Calendar.YEAR);
            int edad = anoHoy - anoNac;
            System.out.println("Tu edad es de: "+ edad);
            
        } catch (Exception e) {
            System.out.println("Ingresa una edad por favor");
            RegistroEdad();
        }
    }
    
    */
    
    public static void RegistroEdad(){
        try {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate fechaNacimiento = LocalDate.parse(fechaNac, formatoFecha);

            LocalDate fechaAct = LocalDate.now();

            Period periodo = Period.between(fechaNacimiento, fechaAct);
            System.out.printf("Tu edad es de: " + periodo.getYears());
            edad = periodo.getYears();
            
            System.out.println();
        } catch (Exception e) {
            System.out.println("No se que poner");
        }
    }
    
    
    public static void RegistroRfc(){
        try {
            System.out.println("Ingrese el rfc (13 caracteres, solo mayúsculas y numeros):");
            Scanner hh = new Scanner(System.in);
            rfc = hh.nextLine();
            if(!ValidarRfc(rfc)){
                System.out.println("\nIngresa un rfc valido (En Mayúsculas) por favor");
                RegistroRfc();
            }
            else if(ValidarRfc(rfc)){
                System.out.println("rfc valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un rfc valido (13 caracteres, solo mayúsculas y numeros), por favor");
            RegistroRfc();
        }
    }
    
    public static void RegistroDatosPersona(){
        RegistroNombre();
        RegistroApellidoP();
        RegistroApellidoM();
        RegistroEmail();
        RegistroTelefono();
        RegistroFechaNac();
        RegistroEdad();
        RegistroRfc();
    }
    
    public static void RegistroNSS(){
        try {
            System.out.println("Ingrese el NSS (Número de Seguro Social), son 11 numeros:");
            Scanner ii = new Scanner(System.in);
            NSS = ii.nextLine();
            if(!ValidarNSS(NSS)){
                System.out.println("\nIngresa un NSS valido (11 numeros) por favor");
                RegistroNSS();
            }
            else if(ValidarNSS(NSS)){
                System.out.println("NSS valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un NSS valido (11 numeros) por favor");
            RegistroNSS();
        }
    }
    
    public static void RegistroCurp(){
        try {
            System.out.println("Ingrese el CURP (18 caracteres, solo mayúsculas y números) :");
            Scanner jj = new Scanner(System.in);
            curp = jj.nextLine();
            if(!ValidarCurp(curp)){
                System.out.println("\nIngresa un Curp valido (18 caracteres, solo mayúsculas y números) por favor");
                RegistroCurp();
            }
            else if(ValidarCurp(curp)){
                System.out.println("Curp valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un Curp valido (18 caracteres, solo mayúsculas y números) por favor");
            RegistroCurp();
        }
    }
    
    public static void RegistroAntiguedad(){
        try {
            System.out.println("Ingrese la antigüedad (solo numero de años):");
            Scanner kk = new Scanner(System.in);
            antiguedad = kk.nextLine();
            if(!ValidarAntiguedad(antiguedad)){
                System.out.println("\nIngresa una Antigüedad valida (solo numero de años), por favor");
                RegistroAntiguedad();
            }
            else if(ValidarAntiguedad(antiguedad)){
                System.out.println("Antigüedad valida");
            }
        } catch (Exception e) {
            System.out.println("Ingresa una Antigüedad valida (solo numero de años), por favor");
            RegistroAntiguedad();
        }
    }
    
    public static void RegistroPuesto(){
        try {
            System.out.println("Ingrese el puesto (solo caracteres de A-Z):");
            Scanner ll = new Scanner(System.in);
            puesto = ll.nextLine();
            if(!ValidarPuesto(puesto)){
                System.out.println("\nIngresa un Puesto valido (solo caracteres de A-Z), por favor");
                RegistroPuesto();
            }
            else if(ValidarPuesto(puesto)){
                System.out.println("Puesto valido");
            }
        } catch (Exception e) {
            System.out.println("Ingresa un Puesto valido (solo caracteres de A-Z), por favor");
            RegistroPuesto();
        }
    }
    
    public static void RegistroDatosEmpleado(){
        RegistroNSS();
        RegistroCurp();
        RegistroAntiguedad();
        RegistroPuesto();
    }
    
    public static void RegistroDiasCreditoCliente(){
        try {
            System.out.println("Ingrese los dias de credito: ");
            Scanner ii = new Scanner(System.in);
            diasCreditoCliente = Integer.parseInt(ii.nextLine());
            if(!ValidarDiasCredito(Integer.toString(diasCreditoCliente))){
                System.out.println("\nIngresa los dias de credito, por favor");
                RegistroDiasCreditoCliente();
            }
            else if(ValidarDiasCredito(Integer.toString(diasCreditoCliente))){
                System.out.println("Dias validos");
            }
        } catch (Exception e) {
            System.out.println("Ingresa los dias de credito, por favor");
            RegistroDiasCreditoCliente();
        }
    }
    
    public static void RegistroMetodoPago(){
        try {
            System.out.println("\n");
            System.out.println("Metodos de pago");
            System.out.println("Elige un metodo \n1.- Efectivo \n2.- Credito \n3.- Debito");
            Scanner jj = new Scanner(System.in);
            metodosPago = Integer.parseInt(jj.nextLine());

            switch (metodosPago) {
                case 1 -> {
                    tipoMetodosPago = "Efectivo";
                    System.out.println("Metodo valido");
                }
                case 2 -> {
                    tipoMetodosPago = "Credito";
                    System.out.println("Metodo valido");
                }
                case 3 -> {
                    tipoMetodosPago = "Debito";
                    System.out.println("Metodo valido");
                }
                default -> {
                        System.out.println("******************************************************");
                        System.out.println("Selecciona un número válido porfavor");
                        RegistroMetodoPago();
                }
            }
        } catch (Exception e) {
            System.out.println("******************************************************");
            System.out.println("Selecciona un valor válido porfavor");
            RegistroMetodoPago();
        }
    }
    
    public static void RegistroTipoPersona(){
        try {
            System.out.println("\n");
            System.out.println("Tipos de persona");
            System.out.println("Elige una tipo \n1.- Fisica \n2.- Moral");
            Scanner jj = new Scanner(System.in);
            tipoPersona = Integer.parseInt(jj.nextLine());

            switch (tipoPersona) {
                case 1 -> {
                    menuTipoPersona = "Fisica";
                    System.out.println("Persona valida");
                }
                case 2 -> {
                    menuTipoPersona = "Moral";
                    System.out.println("Persona valida");
                }
                default -> {
                        System.out.println("******************************************************");
                        System.out.println("Selecciona un número válido porfavor");
                        RegistroTipoPersona();
                }
            }
        } catch (Exception e) {
            System.out.println("******************************************************");
            System.out.println("Selecciona un valor válido porfavor");
            RegistroTipoPersona();
        }
    }
            
    public static void RegistroDatosCliente(){
        RegistroDiasCreditoCliente();
        RegistroMetodoPago();
        RegistroTipoPersona();
    }
    
    public static void RegistroDiasEntrega(){
        try {
            System.out.println("Ingrese los dias de Entrega:");
            Scanner ii = new Scanner(System.in);
            diasEntrega = Integer.parseInt(ii.nextLine());
            if(!ValidarDiasEntrega(Integer.toString(diasEntrega))){
                System.out.println("\nIngresa los dias de Entrega por favor");
                RegistroDiasEntrega();
            }
            else if(ValidarDiasEntrega(Integer.toString(diasEntrega))){
                System.out.println("Dias validos");
            }
        } catch (Exception e) {
            System.out.println("Ingresa una dia valido por favor");
            RegistroDiasEntrega();
        }
    }
    
    public static void RegistroDiasCreditoProveedores(){
        try {
            System.out.println("Ingrese los dias de credito:");
            Scanner jj = new Scanner(System.in);
            diasCreditoProveedor = Integer.parseInt(jj.nextLine());
            if(!ValidarDiasCredito(Integer.toString(diasCreditoProveedor))){
                System.out.println("\nIngresa los dias de credito, por favor");
                RegistroDiasCreditoProveedores();
            }
            else if(ValidarDiasCredito(Integer.toString(diasCreditoProveedor))){
                System.out.println("Dias validos");
            }
        } catch (Exception e) {
            System.out.println("Ingresa los dias de credito, por favor");
            RegistroDiasCreditoProveedores();
        }
    }
    
    public static void RegistroCategoria(){
        try {
            System.out.println("\n");
            System.out.println("Menú de Categorias");
            System.out.println("Elige una categoría \n1.- Fabricante \n2.- Minorista \n3.- Mayorista \n4.- Importador \n5.- Exportador");
            Scanner sc = new Scanner(System.in);
            categoria = Integer.parseInt(sc.nextLine());

            switch (categoria) {
                case 1 -> {
                    tipoCategoria = "Fabricante";
                    System.out.println("Categoria valida");
                }
                case 2 -> {
                    tipoCategoria = "Minorista";
                    System.out.println("Categoria valida");
                }
                case 3 -> {
                    tipoCategoria = "Mayorista";
                    System.out.println("Categoria valida");
                }
                case 4 -> {
                    tipoCategoria = "Importador";
                    System.out.println("Categoria valida");
                }
                case 5 -> {
                    tipoCategoria = "Exportador";
                    System.out.println("Categoria valida");
                }
                default -> {
                        System.out.println("******************************************************");
                        System.out.println("Selecciona un número válido porfavor");
                        RegistroCategoria();
                }
            }
        } catch (Exception e) {
            System.out.println("******************************************************");
            System.out.println("Selecciona un valor válido porfavor");
            RegistroCategoria();
        }
    }
    
    public static void RegistroDatosProveedor(){
        RegistroDiasEntrega();
        RegistroDiasCreditoProveedores();
        RegistroCategoria();
    }
    
    public static void MenuEmpleados() {
        System.out.println("\n");
        System.out.println("Menú de Empleados");
        System.out.println("\n1.- Crear \n2.- Consultar \n3.- Actualizar \n4.- Eliminar \n5.- Salir \n");
        Scanner sc = new Scanner(System.in);
        opcionSQL = Integer.parseInt(sc.nextLine());
        if(opcionSQL==1){
            System.out.println("crear");
            
            RegistroDatosPersona();
            RegistroDatosEmpleado();
            
            empleado e = new empleado(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, NSS, curp, antiguedad, puesto);
        
            empleadoDAO edao = new empleadoDAO();
            edao.insertar(e);
            
            System.out.println("Empleado ingresado a la Base de Datos");
            System.out.println("\n");
            
            MenuEmpleados();
        }
        
        else if(opcionSQL==2){
            System.out.println("consultar");
            empleadoDAO edao = new empleadoDAO();
            edao.seleccionar();
            
            MenuEmpleados();
                        
        }
        
        else if(opcionSQL==3){
            System.out.println("actualizar");
            
            System.out.println("Ingrese el id:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            RegistroDatosPersona();
            RegistroDatosEmpleado();
            
            empleado e = new empleado(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, NSS, curp, antiguedad, puesto);
        
            empleadoDAO edao = new empleadoDAO();
            edao.actualizar(e);
                    
        
            System.out.println("Empleado actualizado en la Base de Datos");
            System.out.println("\n");
            
            MenuEmpleados();
        }
        
        else if(opcionSQL==4){
            System.out.println("eliminar");
            
            System.out.println("Ingrese el id:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            empleado e = new empleado(id);
        
            empleadoDAO edao = new empleadoDAO();
            edao.eliminar(e);
        
            System.out.println("Empleado eliminado de la Base de Datos");
            System.out.println("\n");
            
            MenuEmpleados();
        }
        
        else if(opcionSQL==5){
                Mostrarmenu();
            }
        
        else{
            System.out.println("Inserte un valor válido");
        }
        
    }
    
    public static void MenuClientes(){
        System.out.println("\n");
        System.out.println("Menú de Clientes");
        System.out.println("\n1.- Crear \n2.- Consultar \n3.- Actualizar \n4.- Eliminar \n5.- Salir \n");
        Scanner sc = new Scanner(System.in);
        opcionSQL = Integer.parseInt(sc.nextLine());
        if(opcionSQL==1){
            System.out.println("crear");
            
            RegistroDatosPersona();
            RegistroDatosCliente();
            
            cliente c = new cliente(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasCreditoCliente, tipoMetodosPago, menuTipoPersona);
        
            clienteDAO cdao = new clienteDAO();
            cdao.insertar(c);
            
            System.out.println("Cliente ingresado a la Base de Datos");
            System.out.println("\n");
            
            MenuClientes();
        }
        
        else if(opcionSQL==2){
            System.out.println("consultar");
            clienteDAO cdao = new clienteDAO();
            cdao.seleccionar();
            
            MenuClientes();
            
        }
        
        else if(opcionSQL==3){
            System.out.println("actualizar");
            
            System.out.println("Ingrese el idPersona:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            RegistroDatosPersona();
            RegistroDatosCliente();
            
            cliente c = new cliente(id, nombre, apellidoP, apellidoM, email,  telefono, fechaNac, edad, rfc, diasCreditoCliente, tipoMetodosPago, menuTipoPersona);
        
            clienteDAO cdao = new clienteDAO();
            cdao.actualizar(c);
                    
            System.out.println("Cliente actualizado en la Base de Datos");
            System.out.println("\n");
            
            MenuClientes();
        }
        
        else if(opcionSQL==4){
            System.out.println("eliminar");
            
            System.out.println("Ingrese el id:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            cliente c = new cliente(id);
        
            clienteDAO cdao = new clienteDAO();
            cdao.eliminar(c);
        
            System.out.println("Cliente eliminado de la Base de Datos");
            System.out.println("\n");
            
            MenuClientes();
        }
        
        else if(opcionSQL==5){
                Mostrarmenu();
        }
        
        else{
            System.out.println("Inserte un valor válido");
        }
        
    }
        
    public static void MenuProveedores(){
        System.out.println("Menú de Proveedores");
        System.out.println("\n1.- Crear \n2.- Consultar \n3.- Actualizar \n4.- Eliminar \n5.- Salir \n");
        Scanner sc = new Scanner(System.in);
        opcionSQL = Integer.parseInt(sc.nextLine());
        if(opcionSQL==1){
            System.out.println("crear");
            
            RegistroDatosPersona();
            RegistroDatosProveedor();
            
            proveedor p = new proveedor(nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasEntrega, diasCreditoProveedor, tipoCategoria);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.insertar(p);
            
            System.out.println("Proveedor ingresado a la Base de Datos");
            System.out.println("\n");
            
            MenuProveedores();
        }
        
        else if(opcionSQL==2){
            System.out.println("consultar");
            proveedorDAO pdao = new proveedorDAO();
            pdao.seleccionar();
            
            MenuProveedores();
        }
        
        else if(opcionSQL==3){
            System.out.println("actualizar");
            
            System.out.println("Ingrese el id:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            RegistroDatosPersona();
            RegistroDatosProveedor();
            
            proveedor p = new proveedor(id, nombre, apellidoP, apellidoM, email, telefono, fechaNac, edad, rfc, diasEntrega, diasCreditoProveedor, tipoCategoria);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.actualizar(p);
        
            System.out.println("Proveedor actualizado en la Base de Datos");
            System.out.println("\n");
            
            MenuProveedores();
        }
        
        else if(opcionSQL==4){
            System.out.println("eliminar");
            
            System.out.println("Ingrese el idPersona:");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            proveedor p = new proveedor(id);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.eliminar(p);
        
            System.out.println("Proveedor eliminado de la Base de Datos");
            System.out.println("\n");
            
            MenuProveedores();
        }
        
        else if(opcionSQL==5){
                Mostrarmenu();
        }
        
        else{
            System.out.println("Inserte un valor válido");
        }
        
    }
    
    public static void main(String[] args) {
        Mostrarmenu();
    }
}
