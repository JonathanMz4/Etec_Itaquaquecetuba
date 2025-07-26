import { Body, Controller, Patch, Post } from '@nestjs/common';
import { CreateDogsDto } from './dto/dogs.input.dto';
import { CreateDogsUpdate } from './dto/dogs-update.input';

@Controller('dogs')
export class DogsController {
    @Post()
    cadastro(@Body() dog: CreateDogsDto){
        return "Cadastro Realizado!"
    }

    @Patch()
    Atualizacao(@Body() dog: CreateDogsUpdate){
        return "Dado Atualizado!"
    }
}
