package ru.netology.javaqa;

public class NotRegisteredException extends RuntimeException{
    public NotRegisteredException(String massage) {
        super(massage);
    }

}
