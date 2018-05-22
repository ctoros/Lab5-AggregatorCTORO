package cl.syachile.bean;

import org.apache.camel.Exchange;
import org.apache.camel.processor.aggregate.AggregationStrategy;

import cl.syachile.model.ArrayListDCV;
import cl.syachile.model.Item;

public class EstrategiaAgregacion implements AggregationStrategy {

	@Override
	public Exchange aggregate(Exchange oldExchange, Exchange newExchange) {
		ArrayListDCV arrayList = newExchange.getIn().getBody(ArrayListDCV.class);
		Item item=oldExchange.getIn().getBody(Item.class);
		arrayList.addItem(item);
		oldExchange.getIn().setBody(arrayList);
		return oldExchange;
	}
}
