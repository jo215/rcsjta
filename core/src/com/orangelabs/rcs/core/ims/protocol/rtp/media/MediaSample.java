/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
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
 ******************************************************************************/

package com.orangelabs.rcs.core.ims.protocol.rtp.media;

import com.orangelabs.rcs.core.ims.protocol.rtp.format.video.VideoOrientation;

/**
 * Media sample
 * 
 * @author Jean-Marc AUFFRET
 */
public class MediaSample {

	/**
	 * Data
	 */
	private byte[] data;
	
	/**
	 * Time stamp
	 */
	private long time;

	/**
	 * RTP marker bit
	 */
	private boolean marker = false;	

    /**
     * Sequence number
     */
    private long sequenceNumber;
    // TODO: remove after implement receiver buffer

    /**
     * Video Orientation
     */
    private VideoOrientation videoOrientation;

    /**
     * Constructor
     * 
     * @param data Data
     * @param time Time stamp
     * @Param sequenceNumber Packet sequence number
     */
    public MediaSample(byte[] data, long time, long sequenceNumber) {
        this.data = data;
        this.time = time;
        this.sequenceNumber = sequenceNumber;
    }

	/**
	 * Constructor
	 *
	 * @param data Data
	 * @param time Time stamp
	 */
	public MediaSample(byte[] data, long time) {
		this.data = data;
		this.time = time;
	}

	/**
	 * Constructor
	 * 
	 * @param data Data
	 * @param time Time stamp
	 * @param marker Marker bit
	 */
	public MediaSample(byte[] data, long time, boolean marker) {
		this.data = data;
		this.time = time;
		this.marker = marker;
	}

	/**
	 * Returns the data sample
	 * 
	 * @return Byte array
	 */
	public byte[] getData() {
		return data;
	}
	
	/**
	 * Returns the length of the data sample
	 * 
	 * @return Data sample length
	 */
	public int getLength() {
		if (data != null) {
			return data.length;
		} else {
			return 0;
		}
	}

	/**
	 * Returns the time stamp of the sample
	 * 
	 * @return Time in microseconds
	 */
	public long getTimeStamp() {
		return time;
	}
	
	/**
	 * Is RTP marker bit
	 * 
	 * @return Boolean
	 */
	public boolean isMarker() {
		return marker;
	}

    /**
     * Gets the video orientation
     *
     * @return VideoOrientation
     */
    public VideoOrientation getVideoOrientation() {
        return videoOrientation;
    }

    /**
     * Sets the video orientation
     *
     * @param videoOrientation VideoOrientation
     */
    public void setVideoOrientation(VideoOrientation orientation) {
        this.videoOrientation = orientation;
    }

    /**
     * Get the sequence number
     *
     * @return sequence number
     */
    public long getSequenceNumber() {
        return this.sequenceNumber;
    }

}