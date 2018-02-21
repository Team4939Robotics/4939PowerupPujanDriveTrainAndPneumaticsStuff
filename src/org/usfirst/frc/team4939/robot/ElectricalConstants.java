package org.usfirst.frc.team4939.robot;

public class ElectricalConstants {
		
		//***************************************************************************
		//****************************** DRIVE ENCODERS *****************************
		//***************************************************************************
		
		public static final int LEFT_DRIVE_ENCODER_A                            = 3;
		public static final int LEFT_DRIVE_ENCODER_B                            = 4;
		
		public static final int RIGHT_DRIVE_ENCODER_A                           = 1;
		public static final int RIGHT_DRIVE_ENCODER_B                           = 2;



		//***************************************************************************
		//************************* DRIVE ENCODER CONSTANTS *************************
		//***************************************************************************
		public static final int driveWheelRadius = 6;//wheel radius in inches
		public static final int drivePulsePerRotation = 128; //encoder pulse per rotation
		public static final double driveGearRatio = 4.9/1; //ratio between wheel and encoder
		public static final double driveEncoderPulsePerRot = drivePulsePerRotation*driveGearRatio; //pulse per rotation * gear ratio
		public static final double driveEncoderDistPerTick =(Math.PI*2*driveWheelRadius)/driveEncoderPulsePerRot;
		public static final boolean leftDriveTrainEncoderReverse = true;
		public static final boolean rightDriveTrainEncoderReverse = true;


}
