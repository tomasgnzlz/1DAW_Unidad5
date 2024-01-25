/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author tomas
 */
public class Celda {
    private int posx;
    private int posy;

    public Celda(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Celda{");
        sb.append("posx=").append(posx);
        sb.append(", posy=").append(posy);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
