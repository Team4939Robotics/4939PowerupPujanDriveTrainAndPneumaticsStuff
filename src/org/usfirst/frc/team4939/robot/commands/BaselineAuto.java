package org.usfirst.frc.team4939.robot.commands;

import org.usfirst.frc.team4939.robot.Robot;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class BaselineAuto extends CommandGroup {

    public BaselineAuto() {
    	
    	addSequential(new PlatformUp());
    	// adjust timeout value to make it more efficient
    	addSequential(new DriveCommand(200, 0.3, 10, 2.5));
    	
    }
}
