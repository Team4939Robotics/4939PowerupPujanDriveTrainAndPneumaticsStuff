/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4939.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//CAN 
			public static final int leftDriveFront = 3;
			public static final int leftDriveBack = 1;
			public static final int rightDriveBack = 2;
			public static final int rightDriveFront = 4;
			
			public static final int leftArmIntake = 5;
			public static final int rightArmIntake = 6;
			
		//	public static final int CIMTop = 5;
		//	public static final int CIMBottom = 6;
			
			public static final int climbMotor = 7;
			
		// Solenoids 
			public static final int LeftPlatformPiston = 3;
			public static final int RightPlatformPiston = 6;
			
			public static final int leftIntakePiston = 7;
			public static final int rightIntakePiston = 0;
			
		//	public static final int lockPiston = 4;

}
