# Variaveis

snake_case_nil = nil
snake_case_texto = "Valor"
snake_case_inteiro = 1
snake_case_booleano = true

interpolcao = "Meu texto tem '#{snake_case_texto.length().to_s()}' caracteres"
puts interpolcao

snake_case_array = ['Joaquim', 'José', "João"]
puts snake_case_array[1]

snake_case_array.first()
snake_case_array.last()
snake_case_array.length()


puts "copo".object_id()
puts "copo".object_id()

#diferentes lugares na memoria para a mesma string

puts :copo.object_id()
puts :copo.object_id()

#Com symbol o luga da memoria é o mesmo

snake_case_hash = {nome: 'João', nota: 7, disciplina: 'Ciências'}
puts snake_case_hash[:nome]

hash_e_array = [{nome: 'Alberto', nota: 8, disciplina: 'Ciência'}, {nome: 'Carlos', nota: 5, disciplina: 'Ciência'}]
puts hash_e_array[0][:nome]