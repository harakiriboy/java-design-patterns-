package com.company;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class MacosFactory implements OSFactory {
    private static final Map<WindowTypes, MacosWindow> MACOS_WINDOW;
    private static final Map<MenuTypes, MacosMenu> MACOS_MENU;

    static {
        MACOS_WINDOW = new EnumMap<>(WindowTypes.class);
        Arrays.stream(WindowTypes.values()).forEach(type -> MACOS_WINDOW.put(type, new MacosWindow(type)));

        MACOS_MENU = new EnumMap<>(MenuTypes.class);
        Arrays.stream(MenuTypes.values()).forEach(type -> MACOS_MENU.put(type, new MacosMenu(type)));
    }
    @Override
    public Menu createMenu(MenuTypes menutype) {
        return MACOS_MENU.get(menutype);
    }

    @Override
    public Window createWindow(WindowTypes wintype) {
        return MACOS_WINDOW.get(wintype);
    }

    @Override
    public String toString() {
        return "MacOS Factory";
    }
}
