
package org.usfirst.frc.team4939.robot.subsystems;

import org.usfirst.frc.team4939.robot.RobotMap;
import org.usfirst.frc.team4939.robot.commands.TankDrive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;
import org.usfirst.frc.team4939.robot.ElectricalConstants;
import org.usfirst.frc.team4939.robot.NumberConstants;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {
	ADXRS450_Gyro gyro = new ADXRS450_Gyro();
	public static WPI_TalonSRX leftsidedrivefront = new WPI_TalonSRX(RobotMap.leftDriveFront);
	public static WPI_TalonSRX leftsidedriveback= new WPI_TalonSRX(RobotMap.leftDriveBack);
	public static WPI_TalonSRX rightsidedrivefront= new WPI_TalonSRX(RobotMap.rightDriveFront);
    public static WPI_TalonSRX rightsidedriveback= new WPI_TalonSRX(RobotMap.rightDriveBack);
	private Encoder leftDriveEncoder;
	private Encoder rightDriveEncoder;
	
	/** The drive PID controller. */
	public PIDController drivePID;

	/** The gyro PID controller. */
	public PIDController gyroPID;
    
    static final double kP = 0.03;
    static final double kI = 0.00;
    static final double kD = 0.00;
    static final double kF = 0.00;
    
    static final double kToleranceDegrees = 2.0f;
    
    
    
    private AHRS ahrs;
    PIDController turnController;
    double rotateToAngleRate;
    
    public Drivetrain() {
    	try {
			/***********************************************************************
			 * navX-MXP:
			 * - Communication via RoboRIO MXP (SPI, I2C, TTL UART) and USB.            
			 * - See http://navx-mxp.kauailabs.com/guidance/selecting-an-interface.
			 * 
			 * navX-Micro:
			 * - Communication via I2C (RoboRIO MXP or Onboard) and USB.
			 * - See http://navx-micro.kauailabs.com/guidance/selecting-an-interface.
			 * 
			 * Multiple navX-model devices on a single robot are supported.
			 ************************************************************************/
            ahrs = new AHRS(SerialPort.Port.kMXP);
        } catch (RuntimeException ex ) { 
            DriverStation.reportError("Error instantiating navX MXP:  " + ex.getMessage(), true);
        }
//    	turnController = new PIDController(kP, kI, kD, kF, ahrs, this);
//        turnController.setInputRange(-180.0f,  180.0f);
//        turnController.setOutputRange(-1.0, 1.0);
//        turnController.setAbsoluteTolerance(kToleranceDegrees);
//        turnController.setContinuous(true);
//        
//        /* Add the PID Controller to the Test-mode dashboard, allowing manual  */
//        /* tuning of the Turn Controller's P, I and D coefficients.            */
//        /* Typically, only the P value needs to be modified.                   */
//        LiveWindow.addActuator("DriveSystem", "RotateController", turnController);
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	// Initialize Encoders
    	// Initialize Encoders
    			leftDriveEncoder = new Encoder(ElectricalConstants.LEFT_DRIVE_ENCODER_A,
    					ElectricalConstants.LEFT_DRIVE_ENCODER_B, ElectricalConstants.leftDriveTrainEncoderReverse,
    					Encoder.EncodingType.k4X);

    			leftDriveEncoder.setDistancePerPulse(ElectricalConstants.driveEncoderDistPerTick);

    			rightDriveEncoder = new Encoder(ElectricalConstants.RIGHT_DRIVE_ENCODER_A,
    					ElectricalConstants.RIGHT_DRIVE_ENCODER_B, ElectricalConstants.rightDriveTrainEncoderReverse,
    					Encoder.EncodingType.k4X);

    			rightDriveEncoder.setDistancePerPulse(ElectricalConstants.driveEncoderDistPerTick);
				
    		// Initialize PID controllers
    	    //    drivePID = new PIDController(NumberConstants.pDrive, NumberConstants.iDrive, NumberConstants.dDrive);
    		//	gyroPID = new PIDController(NumberConstants.pGyro, NumberConstants.iGyro, NumberConstants.dGyro);
    		}

    		/**
    		 * Sets the command TankDrive as the default command for this subsystem.
    		 */
    public void runleftsidedrive(double leftdrivestick)
    {
    	leftsidedrivefront.set(leftdrivestick);
    	leftsidedriveback.set(leftdrivestick);
    }
    public void runrightsidedrive(double rightdrivestick)
    { 
    	rightsidedriveback.set(rightdrivestick);
    	rightsidedrivefront.set(rightdrivestick);
    }
@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	setDefaultCommand(new TankDrive());
}




}
