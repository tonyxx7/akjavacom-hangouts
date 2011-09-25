/*
 * Copyright (C) 2011 aki@akjava.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.akjava.gwt.hangout.apilist.client.gapi.hangout;

public class Av {
	public static final native boolean hasMicrophone() /*-{
    return $wnd.gapi.hangout.av.hasMicrophone();
    }-*/;
	public static final native boolean hasCamera() /*-{
    return $wnd.gapi.hangout.av.hasCamera();
    }-*/;
	public static final native boolean hasSpeakers() /*-{
    return $wnd.gapi.hangout.av.hasSpeakers();
    }-*/;
	
	public static final native boolean getMicrophoneMute() /*-{
    return $wnd.gapi.hangout.av.getMicrophoneMute();
    }-*/;
	
	public static final native void setMicrophoneMute(boolean mute) /*-{
     $wnd.gapi.hangout.av.setMicrophoneMute(mute);
    }-*/;
	
	public static final native boolean getCameraMute() /*-{
    return $wnd.gapi.hangout.av.getCameraMute();
    }-*/;
	
	public static final native void setCameraMute(boolean mute) /*-{
    $wnd.gapi.hangout.av.setCameraMute(mute);
   }-*/;

	public static final native double getParticipantVolume(String hangoutId) /*-{
    return $wnd.gapi.hangout.av.getParticipantVolume(hangoutId);
   }-*/;
	
	public static final native boolean isParticipantVisible(String hangoutId) /*-{
    return $wnd.gapi.hangout.av.isParticipantVisible(hangoutId);
    }-*/;
	
	public static final native void setParticipantVisible(String hangoutId,boolean visible) /*-{
    $wnd.gapi.hangout.av.setParticipantVisible(hangoutId,visible);
   }-*/;
	
	public static final native String getAvatar(String hangoutId) /*-{
    return $wnd.gapi.hangout.av.getAvatar(hangoutId);
   }-*/;
	
	public static final native void setAvatar(String hangoutId,String imageUrl) /*-{
    $wnd.gapi.hangout.av.setAvatar(hangoutId,imageUrl);
   }-*/;
	
	public static final native void clearAvatar(String hangoutId) /*-{
    $wnd.gapi.hangout.av.clearAvatar(hangoutId);
   }-*/;
}
