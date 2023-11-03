package collection;

import java.util.Comparator;

public class StramEmpid  implements Comparator<StreamEx>{

	@Override
	public int compare(StreamEx o1, StreamEx o2) {
		if(o1.getEmpNo().isEmpty())
		{
			if(o1.getEmpid()==o2.getEmpid())
			{
				return 0;
			}
			else if(o1.getEmpid()>o2.getEmpid())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		
		
	}
	else
	{
		return o1.getEmpNo().compareTo(o2.getEmpNo());
	}

}
}
