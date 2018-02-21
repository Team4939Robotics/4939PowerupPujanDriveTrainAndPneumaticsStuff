/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4939.robot;

import org.usfirst.frc.team4939.robot.commands.BoxClose;
import org.usfirst.frc.team4939.robot.commands.BoxIntake;
import org.usfirst.frc.team4939.robot.commands.BoxOpen;
import org.usfirst.frc.team4939.robot.commands.BoxOuttake;
import org.usfirst.frc.team4939.robot.commands.BoxStopIntake;
import org.usfirst.frc.team4939.robot.commands.PlatformDown;
import org.usfirst.frc.team4939.robot.commands.PlatformUp;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick DriverController = new Joystick(1);
	public Joystick ShooterController = new Joystick(2);
	
	private Button BoxIntake = new JoystickButton(ShooterController, 4 );
	private Button BoxOuttake = new JoystickButton(ShooterController, 1);
	private Button BoxStopIntake = new JoystickButton(ShooterController, 3);
		
	private Button BoxClose = new JoystickButton(ShooterController, 5 );
	private Button BoxOpen = new JoystickButton(ShooterController, 6);
	private Button PlatformDown = new JoystickButton(ShooterController, 9);
    private Button PlatformUp = new JoystickButton(ShooterController, 10);
    
    public OI() {
		this.BoxIntake.whileHeld(new BoxIntake());
		this.BoxOuttake.whileHeld(new BoxOuttake());
		this.BoxStopIntake.whileHeld(new BoxStopIntake());
		
		this.BoxClose.whenPressed(new BoxClose());
		this.BoxOpen.whenPressed(new BoxOpen());
		
		this.PlatformDown.whenPressed(new PlatformDown());
		this.PlatformUp.whenPressed(new PlatformUp());
		
	}
	

public double left() {
	double leftdrivestick = DriverController.getRawAxis(1);
	if (Math.abs(leftdrivestick) < 0.05)
		return 0.0;
	else
		return leftdrivestick;
}

public double right() {
	double rightdrivestick = DriverController.getRawAxis(5);
	if (Math.abs(rightdrivestick) < 0.05)
		return 0.0;
	else
		return rightdrivestick;
}
}