package xD;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Tarea extends JFrame {
   
	 public Tarea( ){
	   	       
	        Container panelPrincipal = this.getContentPane();
	        panelPrincipal.setLayout( new BorderLayout( ) );
	      
	        setSize( 550, 530 );	              
	        
	        //panel
	        JPanel panelLista = new JPanel();
	        panelLista.setBorder( new TitledBorder( "Lista de Contactos" ) );
	        JList listaContactos = new JList( );
	        JScrollPane lista = new JScrollPane( );
	        lista.setViewportView( listaContactos );
	        lista.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
	     
	        listaContactos.setModel( new DefaultListModel( ) );
	        //crear botones :3
	        JButton botonVer = new JButton( );
	        botonVer.setText( "Ver" );
	        
	        JButton botonEliminar = new JButton( );
	        botonEliminar.setText( "Eliminar" );
	     	        
	        JButton botonTodos = new JButton( );
	        botonTodos.setText( "Ver Todos los contactos" );	      
	        
	        JButton botonPalabra = new JButton( );
	        botonPalabra.setText( "Buscar por palabra clave" );
	        //añadir lista a panelLista
	        panelLista.add(lista, BorderLayout.WEST );
	       
	        //añadir botones al panel
	        JPanel panelBotones= new JPanel();
	        panelBotones.setLayout( new GridLayout( 4, 1, 5, 5 ) );
	        panelBotones.add( botonTodos );
	        panelBotones.add( botonPalabra );
	        panelBotones.add( botonVer );
	        panelBotones.add( botonEliminar );
	        //añadir panel de botones al panelLista
	        panelLista.add(panelBotones, BorderLayout.EAST);
	        
	        JPanel panelContactoP = new JPanel();	       
	        JPanel panelContacto = new JPanel();
	        panelContacto.setLayout(new BorderLayout());
	        panelContacto.setBorder( new TitledBorder( "Datos personales del contacto" ) );
	        
	        JPanel panelDatos= new JPanel();
	      
	        panelDatos.setBorder( BorderFactory.createEmptyBorder( 20, 5, 20, 5 ) );
	        panelDatos.setLayout( new GridLayout( 4, 2, 1, 10 ) );
	        //crear etiquetas
	        JLabel etiquetaNombre = new JLabel( "Nombre" );
	        JLabel etiquetaApellido = new JLabel( "Apellido" );
	        JLabel etiquetaDireccion = new JLabel( "Direccion" );
	        JLabel etiquetaCorreo = new JLabel( "Correo Electronico" );
	        //crear Textfields
	        JTextField campoNombre = new JTextField( 10 );
	        JTextField campoApellido = new JTextField( 10 );
	        JTextField campoDireccion = new JTextField( 10 );
	        JTextField campoCorreo = new JTextField( 10 );
	        //añadir los campos al Panel datos
	        panelDatos.add( etiquetaNombre );
	        panelDatos.add( campoNombre );
	        panelDatos.add( etiquetaApellido );
	        panelDatos.add( campoApellido );
	        panelDatos.add( etiquetaDireccion );
	        panelDatos.add( campoDireccion );
	        panelDatos.add( etiquetaCorreo );
	        panelDatos.add( campoCorreo );
	        //agregar al panel contacto
	        panelContactoP.add(panelDatos,BorderLayout.WEST);
	        //crear panel botones
	        JPanel panelBotones2 = new JPanel( );
	        //crear botones
	        JButton botonAgregar = new JButton( );
	        botonAgregar.setText( "Agregar Contacto" );

	        JButton botonModificar = new JButton( );
	        botonModificar.setText( "Modificar Contacto" );

	        JButton botonLimpiar = new JButton( );
	        botonLimpiar.setText( "Limpiar" );
	       //agregar los botnes al panel botones
	        panelBotones2.add( botonAgregar );
	        panelBotones2.add( botonModificar );
	        panelBotones2.add( botonLimpiar );
	      //agregar al panel contacto
	        panelContacto.add(panelBotones2,BorderLayout.SOUTH);
	        
	        //crear panel telefonos
	        JPanel panelTelefonos = new JPanel( );
	        panelTelefonos.setLayout( new BorderLayout( ) );
	        panelTelefonos.setBorder( new TitledBorder( "Telefonos" ) );

	        JScrollPane deslizableTelefonos = new JScrollPane( );
	        JList listaTelefonos = new JList( );
	        deslizableTelefonos.setPreferredSize( new Dimension( 150, 0 ) );
	        deslizableTelefonos.setViewportView( listaTelefonos );
	        deslizableTelefonos.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
	        deslizableTelefonos.setHorizontalScrollBarPolicy( javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
	        listaTelefonos.setModel( new DefaultListModel( ) );

	       JButton botonAgregaTelefono = new JButton( "Agregar" );        

	       JButton botonEliminaTelefono = new JButton( "Eliminar" );
	       //pane bottelefonos
	       JPanel panBotTelefonos = new JPanel( new GridLayout( 2, 1 ) );
	        panBotTelefonos.add( botonAgregaTelefono );
	        panBotTelefonos.add( botonEliminaTelefono );
	        
	        //añadir al panel telefonos
	        panelTelefonos.add( deslizableTelefonos, BorderLayout.CENTER );
	        panelTelefonos.add( panBotTelefonos, BorderLayout.EAST );
	        
	        JPanel panelPalabras = new JPanel( );
	        panelPalabras.setLayout( new BorderLayout( ) );
	        panelPalabras.setBorder( new TitledBorder( "Palabras Clave" ) );

	        JScrollPane deslizablePalabras = new JScrollPane( );
	        JList listaPalabras = new JList( );
	        deslizablePalabras.setPreferredSize( new Dimension( 150, 0 ) );
	        deslizablePalabras.setViewportView( listaPalabras );
	        deslizablePalabras.setVerticalScrollBarPolicy( javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS );
	        deslizablePalabras.setHorizontalScrollBarPolicy( javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
	        listaPalabras.setModel( new DefaultListModel( ) );

	        JButton botonAgregaPalabra = new JButton( "Agregar" );
	        JButton botonEliminaPalabra = new JButton( "Eliminar" );
	        
	        JPanel panBotPalabras = new JPanel( new GridLayout( 2, 1 ) );
	        panBotPalabras.add( botonAgregaPalabra );
	        panBotPalabras.add( botonEliminaPalabra );

	        panelPalabras.add( deslizablePalabras, BorderLayout.CENTER );
	        panelPalabras.add( panBotPalabras, BorderLayout.EAST );

	        JPanel panelListas = new JPanel( new GridLayout( 2, 1 ) );
	        panelListas.add( panelTelefonos );
	        panelListas.add( panelPalabras );
	        //añadir al panel contacto
	        panelContactoP.add( panelListas, BorderLayout.EAST );
	        panelContacto.add(panelContactoP,BorderLayout.NORTH);
	        
	        //panel opciones
	        JPanel panelOpciones=new JPanel();
	        panelOpciones.setBorder( new TitledBorder( "Extensiones" ) );
	        
	        JButton opcion1 = new JButton( );
	        opcion1.setText( "Opcion1" );
	        
	        JButton opcion2 = new JButton( );
	        opcion2.setText( "Opcion2" );
	        
	        panelOpciones.add( opcion1 );
	        panelOpciones.add( opcion2 );
	        
	        //no pasar
	        //añadirpanelLista al panel pricipal
	        panelPrincipal.add(panelLista, BorderLayout.NORTH);
	        panelPrincipal.add(panelContacto, BorderLayout.CENTER);
	        panelPrincipal.add(panelOpciones,BorderLayout.SOUTH);
	        }
	 
	 public static void main( String[] args ){
	        Tarea ventana = new Tarea( );
	        ventana.setVisible( true );
	    }
}
