package com.powerdata.openpa.padbc;

import com.powerdata.openpa.tools.BaseObject;

public class Node extends BaseObject
{
	private NodeList<?> _list;
	
	public Node(int ndx, NodeList<?> list)
	{
		super(ndx);
		_list = list;
	}
	
	@Override
	public String getObjectID() {return _list.getObjectID(getIndex());}
	public float getNominalKV() {return _list.getNominalKV(getIndex());}
	public float getVmag() {return _list.getVmag(getIndex());}
	public float getVang() {return _list.getVang(getIndex());}
	public void updateVmag(float vm) {_list.updateVmag(getIndex(), vm);}
	public void updateVang(float va) {_list.updateVang(getIndex(), va);}

}