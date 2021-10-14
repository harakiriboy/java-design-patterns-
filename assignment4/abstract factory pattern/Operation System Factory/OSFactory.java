package com.company;

public interface OSFactory {

    Menu createMenu(MenuTypes menutype);

    Window createWindow(WindowTypes wintype);

}
