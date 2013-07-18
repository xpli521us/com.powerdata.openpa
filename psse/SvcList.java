package com.powerdata.openpa.psse;

public abstract class SvcList extends PsseBaseList<SVC>
{
	protected SvcList(){super();}
	public SvcList(PsseModel model) {super(model);}

	/** Get a SVC by it's index. */
	@Override
	public SVC get(int ndx) { return new SVC(ndx,this); }
	/** Get an SwitchIn by it's ID. */
	@Override
	public SVC get(String id) { return super.get(id); }
	public Bus getBus(int ndx) throws PsseModelException
	{
		// TODO Auto-generated method stub
		return null;
	}

}
