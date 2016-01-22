package org.usfirst.frc.team4.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Autonomous extends CommandGroup {
    
    public  Autonomous() {
    	addSequential(new Drive(0.75, 0.75), 5);
    }
}
