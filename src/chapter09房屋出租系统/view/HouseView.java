package chapter09房屋出租系统.view;

import chapter09房屋出租系统.domain.House;
import chapter09房屋出租系统.service.HouseService;
import chapter09房屋出租系统.utils.Utility;


public class HouseView {
    private HouseService houseService = new HouseService(2);
    private boolean loop = true;//控制菜单显示
    private char key = ' ';//几首用户选择
    public void mainMenu(){
        do {
            System.out.println("=================房屋出租系统菜单===========================");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋信息");
            System.out.println("\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退出");
            System.out.println("请输入你的选择（1-6）：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    searchHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        }while (loop);
    }

    private void updateHouse() {//修改房屋信息界面
        System.out.println("请输入你需要修该的房屋编号（-1退出）：");
        int updateId = Utility.readInt();
        if (updateId == -1){
            System.out.println("==========放弃查找房屋信息==========");
            return;
        }
        House search = houseService.search(updateId);
        if (search == null){
            System.out.println("输入的id不存在！");
            System.out.println("==========修改失败==========");
            return;
        }
        System.out.println("姓名（"+search.getName()+"）：");
        String newName = Utility.readString(8);
        System.out.println("电话（"+search.getPhone()+"）：");
        String newPhone = Utility.readString(12);
        System.out.println("地址（"+search.getAddress()+"）：");
        String newAddress = Utility.readString(16);
        System.out.println("租金（"+search.getRent()+"）：");
        int newRent = Utility.readInt();
        System.out.println("状态（"+search.getState()+"）：");
        String newState = Utility.readString(3);
        if (houseService.update(updateId,newName,newPhone,newAddress,newRent,newState)){
            System.out.println("==========修改成功==========");
        }else {
            System.out.println("==========修改失败==========");
        }
    }

    private void searchHouse() {//查找房屋信息
        System.out.println("请输入你需要查找的房屋id：");
        int searchId = Utility.readInt();
        House search = houseService.search(searchId);
        if (search == null){
            System.out.println("输入的id不存在！");
            System.out.println("==========查找失败==========");
            return;
        }
        System.out.println("==========" + searchId + "的房屋信息==========");
        System.out.println(search);
        System.out.println("==========查找成功==========");
    }

    private void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }


    public void listHouse(){
        System.out.println("==========房屋列表==========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========房屋列表显示完毕==========");
    }
    //新增界面
    public void addHouse(){
        System.out.println("==========添加房屋==========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)){
            System.out.println("==========添加房屋成功==========");
        }else {
            System.out.println("==========添加房屋失败==========");
        }
    }
    public void delHouse(){
        System.out.println("==========删除房屋信息==========");
        System.out.println("请输入待删除房屋的编号（-1退出）：");
        int delId = Utility.readInt();
        if (delId == -1){
            System.out.println("==========放弃删除房屋信息==========");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y'){
            if (houseService.del(delId)){
                System.out.println("==========删除房屋信息成功==========");
            }else {
                System.out.println("==========删除房屋信息编号不存在==========");
            }
        }else {
            System.out.println("==========放弃删除房屋信息==========");
        }
    }
}
