package no.hvl.dat102.tabell;

import no.dat102.tabell.TabellKoe;
import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.adt.KoeADTTest;

public class TabellKoeTest extends KoeADTTest{
	
	@Override
	protected KoeADT<Integer> reset(){
		return new TabellKoe<Integer>();
		
	}

}
