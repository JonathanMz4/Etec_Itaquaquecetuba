import { ApiProperty } from '@nestjs/swagger';
import { IsString, IsUrl } from 'class-validator';

export class CreateDogsUpdate {
    @ApiProperty()
    @IsString()
    name: string;
}