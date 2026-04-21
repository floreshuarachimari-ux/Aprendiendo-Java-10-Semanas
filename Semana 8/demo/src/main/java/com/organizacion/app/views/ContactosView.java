package com.organizacion.app.views;

import com.organizacion.app.ui.MainLayout;
import com.organizacion.app.ui.TarjetaContacto;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
@Route(value = "contactos", layout = MainLayout.class)
public class ContactosView extends VerticalLayout 
{
    public ContactosView() 
    {
        add(new H2("Lista de Contactos"));
        add(new Paragraph("Aquí puedes ver la información de tus contactos guardados."));
        FlexLayout contenedorTarjetas = new FlexLayout();
        contenedorTarjetas.setFlexWrap(FlexLayout.FlexWrap.WRAP);
        contenedorTarjetas.setWidthFull();
        contenedorTarjetas.add(
            new TarjetaContacto("Ana Martinez", "70011223", "ana.m@correo.com"),
            new TarjetaContacto("Carlos Quispe", "65544332", "carlos.q@correo.com"),
            new TarjetaContacto("Lucia Flores", "78899001", "lucia.f@correo.com"),
            new TarjetaContacto("Roberto Vargas", "61122334", "roberto.v@correo.com")
        );
        add(contenedorTarjetas);
    }
}
