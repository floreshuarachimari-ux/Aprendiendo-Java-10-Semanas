package com.organizacion.app.ui;
import com.vaadin.flow.component.avatar.Avatar;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
public class TarjetaContacto extends Div 
{
    public TarjetaContacto(String nombre, String telefono, String email) 
    {
        getStyle().set("border", "1px solid #ccc");
        getStyle().set("border-radius", "8px");
        getStyle().set("padding", "15px");
        getStyle().set("margin", "10px");
        getStyle().set("width", "300px");
        Avatar avatar = new Avatar(nombre);
        avatar.setWidth("50px");
        avatar.setHeight("50px");
        H3 nombreTxt = new H3(nombre);
        Icon iconoTel = new Icon(VaadinIcon.PHONE);
        iconoTel.setSize("16px");
        HorizontalLayout filaTel = new HorizontalLayout(iconoTel, new Span(telefono));
        filaTel.setAlignItems(FlexComponent.Alignment.CENTER);
        Icon iconoEmail = new Icon(VaadinIcon.ENVELOPE);
        iconoEmail.setSize("16px");
        HorizontalLayout filaEmail = new HorizontalLayout(iconoEmail, new Span(email));
        filaEmail.setAlignItems(FlexComponent.Alignment.CENTER);
        VerticalLayout info = new VerticalLayout(nombreTxt, filaTel, filaEmail);
        info.setSpacing(false);
        info.setPadding(false);
        HorizontalLayout layoutPrincipal = new HorizontalLayout(avatar, info);
        layoutPrincipal.setAlignItems(FlexComponent.Alignment.CENTER);
        add(layoutPrincipal);
    }
}
