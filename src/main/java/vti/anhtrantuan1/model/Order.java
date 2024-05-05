package vti.anhtrantuan1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order{
	private int orderId;
	private Date orderDate;
	private int customerId;
	private double amount;
	private short status;
}
