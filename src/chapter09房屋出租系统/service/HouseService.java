package chapter09房屋出租系统.service;

import chapter09房屋出租系统.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNum = 1;//当前有多少个房屋信息
    private int idCounter = 1;//记录id自增长的值

    public HouseService(int size) {
        houses = new House[size];//指定数组大小
        houses[0] = new House(1,"jack","112","wwww",2000,"为出租");
    }
    //list方法返回数组,显示房屋列表
    public House[] list(){
        return houses;
    }
    public boolean add(House newHouse){
        if (houseNum == houses.length){
            House[] newHouse1 = new House[houseNum + 1];
            for (int i = 0; i < houseNum; i++) {
                newHouse1[i] = houses[i];
            }
            houses = newHouse1;
        }
        houses[houseNum++] = newHouse;
        //id自增长
        newHouse.setId(++idCounter);
        return true;
    }
    public boolean del(int delId){
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if (index == -1){
            return false;
        }
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNum] = null;
        return true;
    }

    public House search(int searchId) {
        for (int i = 0; i < houseNum; i++) {
            if (searchId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

    public boolean update(int updateId,String newName,String newPhone,String newAddress,int newRent,String newState) {
        for (int i = 0; i < houseNum; i++) {
            if (updateId == houses[i].getId()){
                houses[i].setName(newName);
                houses[i].setPhone(newPhone);
                houses[i].setAddress(newAddress);
                houses[i].setRent(newRent);
                houses[i].setState(newState);
                return true;
            }
        }
        return false;
    }
}
