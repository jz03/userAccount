package com.jz.account.dto;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//���ﳵ��
public class Cart {

	//������Ʒ�ļ���
	private HashMap<Items,Integer> goods;
	
	//���ﳵ���ܽ��
	private double totalPrice;

	//���췽��
	public Cart()
	{
		goods = new HashMap<Items,Integer>();
		totalPrice = 0.0;
	}
	
	
	public HashMap<Items, Integer> getGoods() {
		return goods;
	}

	public void setGoods(HashMap<Items, Integer> goods) {
		this.goods = goods;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	//�����Ʒ�����ﳵ�ķ���
	public boolean addGoodsInCart(Items item ,int number)
	{
		if(goods.containsKey(item))
		{
			goods.put(item, goods.get(item)+number);
		}
		else
		{
			goods.put(item, number);	
		}
		calTotalPrice(); //���¼��㹺�ﳵ���ܽ��
		return true;
	}
	
	//ɾ����Ʒ�ķ���
	public boolean removeGoodsFromCart(Items item)
	{
		goods.remove(item);
		calTotalPrice(); //���¼��㹺�ﳵ���ܽ��
		return true;
	}
	
	//ͳ�ƹ��ﳵ���ܽ��
	public double calTotalPrice()
	{
		double sum = 0.0;
		Set<Items> keys = goods.keySet(); //��ü��ļ���
		Iterator<Items> it = keys.iterator(); //��õ���������
	    while(it.hasNext())
	    {
	    	Items i = it.next();
	    	sum += i.getPrice()* goods.get(i);
	    }
	    this.setTotalPrice(sum); //���ù��ﳵ���ܽ��
	    return this.getTotalPrice();
	}
	
	public static void main(String[] args) {

		//先创建两个商品对象
		Items i1 = new Items(1,"沃特篮球鞋","温州",200,500,"001.jpg");
		Items i2 = new Items(2,"李宁运动鞋","广州",300,500,"002.jpg");
		Items i3 = new Items(1,"沃特篮球鞋","温州",200,500,"001.jpg");

		Cart c = new Cart();
		c.addGoodsInCart(i1, 1);
		c.addGoodsInCart(i2, 2);
		//再次购买沃特篮球鞋，购买3双
		c.addGoodsInCart(i3, 3);


		//变量购物商品的集合
		Set<Map.Entry<Items, Integer>> items= c.getGoods().entrySet();
		for(Map.Entry<Items, Integer> obj:items)
		{
			System.out.println(obj);
		}


		System.out.println("购物车的总金额："+c.getTotalPrice());
		
	}
	
}
