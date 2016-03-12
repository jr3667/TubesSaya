/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TubesPBO;

/**
 *
 * @author Ndas-PC
 */
public abstract class Orang {
    protected String name;
	protected String alamat;
	protected long noHP;
	protected String jenisKelamin;
	
    public Orang(String name, String alamat, long noHP, String jenisKelamin   ){
		this.name = name;
		this.alamat = alamat;
		this.noHP = noHP;
		this.jenisKelamin = jenisKelamin;
	}

}
