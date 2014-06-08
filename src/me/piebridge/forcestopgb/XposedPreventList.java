package me.piebridge.forcestopgb;

import java.util.Set;

public class XposedPreventList extends XposedListFragment {

	@Override
	protected Set<String> getPackageNames(XposedActivity activity) {
		return activity.getPreventPackages().keySet();
	}

	@Override
	protected boolean canUseCache() {
		return true;
	}

	private static Position position;

	@Override
	protected void setListPosition(Position _position) {
		position = _position;
	}

	@Override
	protected Position getListPosition() {
		return position;
	}


}