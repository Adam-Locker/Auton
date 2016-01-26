package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Chassis extends Subsystem {
    
	private VictorSP m_leftFwd, m_leftRwd, m_rightFwd, m_rightRwd;
	private RobotDrive drive;
	
	public Chassis(){
		super();
		m_leftFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTFRONT);
		m_leftRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_LEFTREAR);
		m_rightFwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
		m_rightRwd = new VictorSP(RobotMap.CHASSIS_MOTOR_RIGHTREAR);
		
		drive = new RobotDrive(m_leftFwd, m_leftRwd, m_rightFwd, m_rightRwd);
	}
	
    public void initDefaultCommand() {
    }
    
    public void tankDrive(double left, double right){
    	drive.tankDrive(left, right);
    }
    
    public void arcadeDrive(double x, double y){
    	drive.arcadeDrive(x, y);
    }
    
    public void stop(){
    	tankDrive(0,0);
    }
}

