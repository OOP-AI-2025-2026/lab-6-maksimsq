package org.example;

// Клас Car, який реалізує інтерфейс Comparable
class Car implements Comparable {
    private int price;
    private int year;        // рік виготовлення
    private int horsePower;  // кінські сили

    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    // Гетери та сетери
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Object o) {
        Car other = (Car) o;

        // порівнюємо за ціною
        if (this.price < other.price) return 1;
        if (this.price > other.price) return -1;

        // якщо ціни рівні - порівнюємо за роком
        if (this.year > other.year) return 1;
        if (this.year < other.year) return -1;

        // якщо рік однаковий - порівнюємо за кінськими силами
        if (this.horsePower > other.horsePower) return 1;
        if (this.horsePower < other.horsePower) return -1;

        // якщо все однакове - рівні
        return 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", year=" + year +
                ", horsePower=" + horsePower +
                '}';
    }
}
}