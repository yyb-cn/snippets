package com.seageo.digext;

import com.smartfoxserver.v2.extensions.SFSExtension;

public class DigExt extends SFSExtension {

	@Override
	public void init() {
		trace("Hello, this is my first SFS2X Extension!");
	}

}
