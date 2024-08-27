/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.learnings;

/**
 *
 * @author codespace
 */
public class Tree {
    int heightFt;
    TreeType treeType;
    int trunkDiameterIn;
    
    Tree (int heightFt, TreeType treeType, int trunkDiameterIn) {
        this.heightFt = heightFt;
        this.treeType = treeType;
        this.trunkDiameterIn = trunkDiameterIn;
    }

void grow () {
    this.heightFt = this.heightFt + 10;
    this.trunkDiameterIn = this.trunkDiameterIn + 15;
    }
}
