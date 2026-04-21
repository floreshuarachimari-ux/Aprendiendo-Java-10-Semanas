package com.organizacion.app.views;
import com.organizacion.app.ui.MainLayout;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
@Route(value = "avatar-check", layout = MainLayout.class)
public class EjercicioAvatarView extends VerticalLayout 
{
    public EjercicioAvatarView() 
    {
        setAlignItems(Alignment.CENTER);
        add(new H2("Ejercicio: Maricel Flores"));
        Avatar avatarFull = new Avatar("Maricel Flores");
        avatarFull.setWidth("80px");
        avatarFull.setHeight("80px");
        add(new Paragraph("Iniciales generadas para 'Maricel Flores':"));
        add(avatarFull);
        Avatar avatarSingle = new Avatar("Maricel");
        avatarSingle.setWidth("80px");
        avatarSingle.setHeight("80px");
        add(new Paragraph("Inicial generada para 'Maricel':"));
        add(avatarSingle);
    }
}