package test;

import data.clienteDAO;
import data.proveedorDAO;
import domain.cliente;
import domain.proveedor;
import java.util.Scanner;

public class personaTest {
    static int opcionSQL = 0;
    static int menu;
    static int id;
    static String nombre;
    static String apellidos;
    static String email;
    static String rfc;
    static int diasCredito;
    static int tipoPago;
    static String strtiPago;
    static String producto;
    static int idProveedor;
    
    
    public static void mostrarMenu(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige una opción \n1.- Cliente \n2.- Proveedor \n3.- Salir");
        menu = Integer.parseInt(sc.nextLine());
        
        if(menu==1){
            menuCliente();
        }
        else if(menu==2){
            menuProveedor();
        }
        else if(menu==3){
            System.out.println("Has salido con éxito");
        }
        else{
            System.out.println("No es válido");
        }
    }
    
    public static void menuCliente(){
        System.out.println("\nMenú de Clientes");
        System.out.println("1.- Crear \n2.- Consultar \n3.- Actualizar \n4.- Eliminar");
        Scanner sc = new Scanner(System.in);
        opcionSQL = Integer.parseInt(sc.nextLine());
        
        if(opcionSQL==1){
            System.out.println("\nIngrese el nombre: ");
            Scanner bb = new Scanner(System.in);
            nombre = bb.nextLine();
            
            System.out.println("Ingrese el apellido: ");
            Scanner cc = new Scanner(System.in);
            apellidos = cc.nextLine();
            
            System.out.println("Ingrese el email: ");
            Scanner dd = new Scanner(System.in);
            email = dd.nextLine();
            
            System.out.println("Ingrese el rfc: ");
            Scanner ee = new Scanner(System.in);
            rfc = ee.nextLine();
            
            System.out.println("Ingrese los días de crédito: ");
            Scanner ff = new Scanner(System.in);
            diasCredito = Integer.parseInt(ff.nextLine());
            
            System.out.println("Ingrese el tipo de pago (int): ");
            Scanner gg = new Scanner(System.in);
            tipoPago = Integer.parseInt(gg.nextLine());
            
            System.out.println("Ingrese el tipo de pago (str): ");
            Scanner hh = new Scanner(System.in);
            strtiPago = hh.nextLine();
            
            cliente c = new cliente(nombre, apellidos, email, rfc, diasCredito, tipoPago, strtiPago);
        
            clienteDAO cdao = new clienteDAO();
            cdao.insertar(c);
            
            System.out.println("Cliente agregado");
            //System.out.println("\n");
        }
        else if(opcionSQL==2){
            System.out.println("\nIngrese el id de la persona: ");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            cliente c = new cliente(id);
        
            clienteDAO cdao = new clienteDAO();
            cdao.eliminar(c);
        
            System.out.println("Cliente eliminado");
            //System.out.println("\n");
        }
        else if(opcionSQL==3){
            System.out.println("\nIngrese el id de la persona: ");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            System.out.println("Ingrese el nombre: ");
            Scanner bb = new Scanner(System.in);
            nombre = bb.nextLine();
            
            System.out.println("Ingrese el apellido: ");
            Scanner cc = new Scanner(System.in);
            apellidos = cc.nextLine();
            
            System.out.println("Ingrese el email: ");
            Scanner dd = new Scanner(System.in);
            email = dd.nextLine();
            
            System.out.println("Ingrese el rfc: ");
            Scanner ee = new Scanner(System.in);
            rfc = ee.nextLine();
            
            System.out.println("Ingrese los días de crédito: ");
            Scanner ff = new Scanner(System.in);
            diasCredito = Integer.parseInt(ff.nextLine());
            
            System.out.println("Ingrese el tipo de pago (int): ");
            Scanner gg = new Scanner(System.in);
            tipoPago = Integer.parseInt(gg.nextLine());
            
            System.out.println("Ingrese el tipo de pago (str): ");
            Scanner hh = new Scanner(System.in);
            strtiPago = hh.nextLine();
            
            cliente c = new cliente(id, nombre, apellidos, email, rfc, diasCredito, tipoPago, strtiPago);
        
            clienteDAO cdao = new clienteDAO();
            cdao.actualizar(c);
        
            System.out.println("Cliente actualizado");
            //System.out.println("\n");
        }
        else if(opcionSQL==4){
            System.out.println("\nIngrese el id de la persona: ");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            cliente c = new cliente(id);
        
            clienteDAO cdao = new clienteDAO();
            cdao.eliminar(c);
        
            System.out.println("Cliente eliminado");
            //System.out.println("\n");
        }
        else{
            System.out.println("No es válido");
        }
        mostrarMenu();
    }
    
    public static void menuProveedor(){
        System.out.println("\nMenú de Proveedores");
        System.out.println("1.- Crear \n2.- Consultar \n3.- Actualizar \n4.- Eliminar");
        Scanner sc = new Scanner(System.in);
        opcionSQL = Integer.parseInt(sc.nextLine());
        if(opcionSQL==1){
            System.out.println("\nIngrese el nombre: ");
            Scanner bb = new Scanner(System.in);
            nombre = bb.nextLine();
            
            System.out.println("Ingrese el apellido: ");
            Scanner cc = new Scanner(System.in);
            apellidos = cc.nextLine();
            
            System.out.println("Ingrese el email: ");
            Scanner dd = new Scanner(System.in);
            email = dd.nextLine();
            
            System.out.println("Ingrese el rfc: ");
            Scanner ee = new Scanner(System.in);
            rfc = ee.nextLine();
            
            System.out.println("Ingrese el producto: ");
            Scanner ff = new Scanner(System.in);
            producto = ff.nextLine();
            
            System.out.println("Ingrese el id del proveedor: ");
            Scanner gg = new Scanner(System.in);
            idProveedor = Integer.parseInt(gg.nextLine());
            
            proveedor p = new proveedor(nombre, apellidos, email, rfc, producto, idProveedor);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.insertar(p);
            
            System.out.println("Proveedor agregado");
        }
        else if(opcionSQL==2){
            System.out.println("\nIngrese el id del proveedor: ");
            Scanner gg = new Scanner(System.in);
            id = Integer.parseInt(gg.nextLine());
            
            proveedor p = new proveedor(id);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.eliminar(p);
        
            System.out.println("Proveedor eliminado");
        }
        else if(opcionSQL==3){
            System.out.println("\nIngrese el id de la persona: ");
            Scanner aa = new Scanner(System.in);
            id = Integer.parseInt(aa.nextLine());
            
            System.out.println("Ingrese el nombre: ");
            Scanner bb = new Scanner(System.in);
            nombre = bb.nextLine();
            
            System.out.println("Ingrese el apellido: ");
            Scanner cc = new Scanner(System.in);
            apellidos = cc.nextLine();
            
            System.out.println("Ingrese el email: ");
            Scanner dd = new Scanner(System.in);
            email = dd.nextLine();
            
            System.out.println("Ingrese el rfc: ");
            Scanner ee = new Scanner(System.in);
            rfc = ee.nextLine();
            
            System.out.println("Ingrese el producto: ");
            Scanner ff = new Scanner(System.in);
            producto = ff.nextLine();
            
            System.out.println("Ingrese el id del proveedor: ");
            Scanner gg = new Scanner(System.in);
            idProveedor = Integer.parseInt(gg.nextLine());
            
            proveedor p = new proveedor(id, nombre, apellidos, email, rfc, producto, idProveedor);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.actualizar(p);
        
            System.out.println("Proveedor actualizado");
        }
        else if(opcionSQL==4){
            System.out.println("\nIngrese el id del proveedor: ");
            Scanner gg = new Scanner(System.in);
            id = Integer.parseInt(gg.nextLine());
            
            proveedor p = new proveedor(id);
        
            proveedorDAO pdao = new proveedorDAO();
            pdao.eliminar(p);
        
            System.out.println("Proveedor eliminado");
        }
        else{
            System.out.println("No es válido");
        }
        mostrarMenu();
    }
    
    public static void main(String[] args) {
        mostrarMenu();
    }
}