/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author KHANH
 */
public abstract class InterfaceGara<EntityType, KeyType> {
    public abstract void insert(EntityType entity);
    public abstract void update(EntityType entity);
    public abstract void delete(KeyType Id);
    public abstract EntityType seleteById(KeyType Id);
    public abstract List<EntityType> seleteAll();
    protected abstract List<EntityType> seleteBySql(String sql , Object...args);
}
