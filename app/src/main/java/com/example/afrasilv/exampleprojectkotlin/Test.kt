package com.example.afrasilv.exampleprojectkotlin

//para poder heredar de una clase, hay que poner open delante
open class Person(name: String = "Peter", val age: Int = 10) {
    var name: String = name
        get() = "Name: $field"
        set(value) {
            if (value != field) {
                field = value
            }
        }
    /*init {
        this.name = name
        this.age = age
    }*/
}

class Developer : Person {
    constructor(name: String) : super(name)
}

fun test() {
    val person = Person("John", 30)
    val age = person.age
    val name = person.name
}