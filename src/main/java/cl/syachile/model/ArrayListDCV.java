package cl.syachile.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ArrayList")
@XmlAccessorType(XmlAccessType.FIELD)
public class ArrayListDCV {

	@XmlElement(name = "item")
	private List<Item> item = new ArrayList<Item>();

	public void addItem(Item item) {
		this.item.add(item);
	}
	
	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}
	
	
}
