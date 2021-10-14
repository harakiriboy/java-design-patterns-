package com.company;

public class Runner {
    public static void main(String[] args) {
        OSFactory osFactory = new MacosFactory();
        Menu menu = osFactory.createMenu(MenuTypes.PopUp_Menu);
        Window window = osFactory.createWindow(WindowTypes.FixedWindow);
        LOGGER.info(" manufactured in ",osFactory, menu, window);

        menu = osFactory.createMenu(MenuTypes.MovingBar_Menu);
        window = osFactory.createWindow(WindowTypes.BiFoldWindow);
        LOGGER.info(" manufactired in ", osFactory, menu ,window);

        osFactory = new WindowsFactory();
        menu = osFactory.createMenu(MenuTypes.PullDown_Menu);
        window = osFactory.createWindow(WindowTypes.RounCircleWindow);
        LOGGER.info(" manufactured in ", osFactory, menu, window);


    }

}
