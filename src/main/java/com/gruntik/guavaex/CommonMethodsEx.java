package com.gruntik.guavaex;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ComparisonChain;
import lombok.*;

public class CommonMethodsEx {
    public static void main(String[] args) {
        System.out.println(new Pet("Asay", 15));

        Pet pet1 = new Pet("asya", 122);
        Pet pet2 = new Pet("asya", 40);

        System.out.println(pet1.compareTo(pet2));

    }
}

@Data
@AllArgsConstructor
class Pet implements Comparable<Pet> {

    String name;
    int age;

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }

    @Override
    public int compareTo(Pet pet) {
        return ComparisonChain.start()
                .compare(this.name, pet.getName())
                .compare(this.age, pet.getAge())
                .result();
    }
}