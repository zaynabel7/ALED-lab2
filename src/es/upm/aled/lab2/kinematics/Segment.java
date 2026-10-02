package es.upm.aled.lab2.kinematics;

import java.util.List;

// TODO: Implemente la clase
public class Segment {
	double angle;
	double length;
	List<Segment> children; 
	public Segment(double angle, double length) {
		this.angle = angle;
		this.length = length;
	}
	public double getAngle() {
		return angle;
	}
	public void setAngle(double angle) {
		this.angle = angle;
	}
	public double getLength() {
		return length;
	}
	
	public List<Segment> getChildren() {
		return children;
	}
	
	public void addChild(Segment child) {
		if(!children.contains(child)){
			children.add(child);
		}
	}
	
}
