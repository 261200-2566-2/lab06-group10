import java.util.ArrayList;
import java.util.List;

//จำลองการสร้างตัวละคร การเลเวลอัพ ติดตั้งอาวุธ รวมไปถึงการต่อสู้กันของตัวละคร
public class Lab06 {
    public static void main(String[] args) {
        Character warrior = Character.createCharacter("ตัวตึง", "Warrior", 100, 100);
        Weapon sword = Weapon.createWeapon("ดาบโง่ๆ", "Warrior", 1000, 0, 0, 15);
        Weapon armor = Weapon.createWeapon("เกราะโนเกีย","Warrior",0,500,0,20);
        Accessoryy ring = Accessoryy.createAccessory("แหวน",500,50,100,30);
        warrior.levelUp();
        List<Accessory> accessorieList = new ArrayList<>();
        List<Equipment> equipmentList = new ArrayList<>();
        equipmentList.add(sword);
        equipmentList.add(armor);
        accessorieList.add(ring);
        warrior.equipWeapon(equipmentList);
        Character.Display(warrior);
        warrior.levelUp();
        warrior.gainXp(300);
        warrior.levelUp();
        warrior.equipAccessory(accessorieList);
        System.out.println("LevelUp Test");
        Character.Display(warrior);

        Character kiana = Character.createCharacter("Kiana", "Mage", 200, 50);
        Weapon kianagun = Weapon.createWeapon("Domain of the void","Mage",600,0,500,25);
        Weapon kianaStigma = Weapon.createWeapon("Honkai queen","Mage",0,5000,6000,0);

        List<Equipment> kianaEquipmentlist = new ArrayList<>();
        kianaEquipmentlist.add(kianaStigma);
        kianaEquipmentlist.add(kianagun);
        kiana.levelUp();
        kiana.equipWeapon(kianaEquipmentlist);
        Character.Display(kiana);
        
        while (warrior.isAlive() && kiana.isAlive()) {
            warrior.attack(kiana);
            if (kiana.isAlive()) {
                kiana.attack(warrior);
            }
        }
    }
}