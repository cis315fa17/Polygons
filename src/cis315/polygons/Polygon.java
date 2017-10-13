/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis315.polygons;

import java.util.ArrayList;

/**
 *
 * @author atmanning
 */

public class Polygon {
    
    private ArrayList<Point2D> points;
    
    public ArrayList<Point2D> getPoints() {
        return (ArrayList<Point2D>)points.clone();
    }
    
}
