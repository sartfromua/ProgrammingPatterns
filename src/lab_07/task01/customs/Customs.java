package lab_07.task01.customs;

// Інтерфейс митниця
public interface Customs {
    float vehiclePrice(Auto auto); // розрахувати ціну автомобіля
    float tax(Auto auto);          // розрахувати варність розмитнення автомобіля
}
