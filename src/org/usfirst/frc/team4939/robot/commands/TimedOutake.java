package org.usfirst.frc.team4939.robot.commands;

import org.usfirst.frc.team4939.robot.*;

import edu.wpi.first.wpilibj.command.Command;

public class TimedOutake extends Command {

	// Variables to hold parameter information
	private double speed;
	private double timeOut;

	/**
	 * Instantiates a new turn command.
	 *
	 * @param angle
	 *            Angle the robot will turn to (-180 <-> 180)
	 * @param speed
	 *            The speed the robot will turn at (0.0 - 1.0)
	 * @param timeOut
	 *            The time out in seconds
	 */
	public TimedOutake(double speed, double timeOut) {
		this.speed = speed;
		this.timeOut = timeOut;
		requires(Robot.intake);
	}

	// Called just before this Command runs the first time
	protected void initialize() {
		setTimeout(timeOut);
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.intake.useIntake(speed);
	}

	// Command is finished when timed out
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true, once done will stop robot from
	// moving.
	protected void end() {
		Robot.intake.useIntake(0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run, once done will stop robot from moving.
	protected void interrupted() {
	}
}

