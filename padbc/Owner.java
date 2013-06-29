package com.powerdata.openpa.padbc;

import com.powerdata.openpa.tools.BaseObject;

public abstract class Owner extends BaseObject implements Container
{
	private OwnerList<?> _list;
	
	public Owner(int ndx, OwnerList<?> list)
	{
		super(ndx);
		_list = list;
	}
	
	@Override
	public String getObjectID() {return _list.getObjectID(getIndex());}
	public String getOwnerName() {return _list.getOwnerName(getIndex());}
}