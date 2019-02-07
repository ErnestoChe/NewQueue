package com.company;

import java.util.*;

class Queue<T>
{
    private LinkedList<T> list;
    public Queue()
    {
        list = new LinkedList();
        // инициализация внутреннего хранилища очереди
    }

    public void enqueue(T item)
    {
        list.addLast(item);
        // вставка в хвост
    }

    public T dequeue()
    {
        if(list.size() == 0){
            return null;
        }else
            return list.removeFirst();
        // выдача из головы
        // null если очередь пустая
    }

    public int size()
    {
        return list.size();
        // размер очереди
    }

}