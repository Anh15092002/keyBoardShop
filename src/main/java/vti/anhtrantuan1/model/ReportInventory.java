package vti.anhtrantuan1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReportInventory implements Serializable{
	private Serializable group;
	private Double sum;
	private Long count;
}
