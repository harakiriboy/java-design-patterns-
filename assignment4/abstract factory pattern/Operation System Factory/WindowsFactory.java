package com.company;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class WindowsFactory implements OSFactory {

    private static final Map<WindowTypes, WindowsWindow> WINDOWS_WINDOW;
    private static final Map<MenuTypes, WindowsMenu> WINDOWS_MENU;

    static {
        WINDOWS_WINDOW = new EnumMap<>(WindowTypes.class);
        Arrays.stream(WindowTypes.values()).forEach(type -> WINDOWS_WINDOW.put(type, new WindowsWindow(type)));

        WINDOWS_MENU = new EnumMap<>(MenuTypes.class);
        Arrays.stream(MenuTypes.values()).forEach(type -> WINDOWS_MENU.put(type, new WindowsMenu(type)));
    }

    @Override
    public Menu createMenu(MenuTypes menutype) {
        return WINDOWS_MENU.get(menutype);
    }

    @Override
    public Window createWindow(WindowTypes wintype) {
        return WINDOWS_WINDOW.get(wintype);
    }

    @Override
    public String toString() {
        return "Windows Factory";
    }
}
