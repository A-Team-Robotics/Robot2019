package frc.robot.commands;

import edu.wpi.first.wpilibj.command.InstantCommand;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Robot;

public class WaitTurretToPos extends InstantCommand{
    int pos = 0;

    public WaitTurretToPos(int pos){
        this.pos=pos;
        requires(Robot.turret);
    }

    @Override
    protected void initialize() {
        Robot.turret.setTurretPos(pos);
    }
    @Override
    protected void end() {
        Scheduler.getInstance().add(new MoveTurret());
    }
}