package com.sisinf.agenda.ui;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H2;
public class MainLayout extends AppLayout 
{
    public MainLayout() 
    {
        H2 titulo = new H2("Aplicacion");
        addToNavbar(titulo);
    }
}