package com.organizacion.app.views;
import com.organizacion.app.ui.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
@Route(value = "", layout = MainLayout.class)
public class InicioView extends VerticalLayout 
{
    public InicioView() 
    {
        add(new H2("Bienvenido a la Agenda"));
        add(new Paragraph("Esta es una aplicación construida íntegramente en Java con Vaadin."));
        add(new H3("Selecciona una opción del menú superior para comenzar."));
    }
}