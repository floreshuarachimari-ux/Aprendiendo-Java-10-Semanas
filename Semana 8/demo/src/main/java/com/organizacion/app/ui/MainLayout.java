package com.organizacion.app.ui;

import com.organizacion.app.views.ContactosView;
import com.organizacion.app.views.InicioView;
import com.organizacion.app.views.EjercicioAvatarView;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;
public class MainLayout extends AppLayout 
{
    public MainLayout() 
    {
        H2 tituloApp = new H2("Agenda Web");
        tituloApp.getStyle().set("margin", "var(--lumo-space-m)");
        MenuBar menu = new MenuBar();
        menu.addItem(new RouterLink("Inicio", InicioView.class));
        menu.addItem(new RouterLink("Contactos", ContactosView.class));
        menu.addItem(new RouterLink("Ejercicio Avatar", EjercicioAvatarView.class));
        HorizontalLayout header = new HorizontalLayout(tituloApp, menu);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidthFull();
        header.expand(tituloApp);
        addToNavbar(header);
    }
}