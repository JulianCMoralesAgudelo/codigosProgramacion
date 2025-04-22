#!/bin/bash
# -*- ENCODING: UTF-8 -*-

<<'MULTILINE-COMMENT'
Script          : gitCommit.sh
Autor           : Julián Camilo Morales Agudelo
Versión         : 2.0
Modificado      : 2025-04-22
Descripcion     : Realizar commits siguiendo la convención Conventional Commits
MULTILINE-COMMENT

clear

# Config global (solo si no está seteado)
git config --global user.email >/dev/null || git config --global user.email "juliancmorales10@gmail.com"
git config --global user.name >/dev/null || git config --global user.name "julian"

# Opciones de tipo de commit
echo "Seleccione el tipo de commit:"
echo ""
echo "1. feat      → Nueva funcionalidad"
echo "2. fix       → Corrección de errores"
echo "3. docs      → Cambios en documentación"
echo "4. style     → Formato (espacios, comas, etc)"
echo "5. refactor  → Refactorización de código"
echo "6. test      → Añadir o modificar pruebas"
echo "7. chore     → Mantenimiento, tareas menores"
echo "8. perf      → Mejora de rendimiento"
echo "9. ci        → Cambios en CI/CD"

read -p "Ingrese el número del tipo: " opcion

case $opcion in
    1) type="feat" ;;
    2) type="fix" ;;
    3) type="docs" ;;
    4) type="style" ;;
    5) type="refactor" ;;
    6) type="test" ;;
    7) type="chore" ;;
    8) type="perf" ;;
    9) type="ci" ;;
    *) echo "Opción inválida."; exit 1 ;;
esac

# Scope (opcional)
read -p "Ingrese el scope (opcional, ej: login, api) y presione Enter: " scope
[ -n "$scope" ] && scope="($scope)"

# Asunto (obligatorio)
while true; do
    read -p "Ingrese el asunto del commit (máx. 50 caracteres, sin punto final): " subject
    if [ ${#subject} -le 50 ]; then
        break
    else
        echo "❗ El asunto debe tener 50 caracteres o menos."
    fi
done

# Cuerpo (opcional)
echo "Ingrese el cuerpo del commit (opcional, presione Enter para omitir):"
read body

# Footer (opcional)
echo "Ingrese el footer (opcional, por ejemplo: Closes #123):"
read footer

# Construir mensaje
commit_message="$type$scope: $subject"
[ -n "$body" ] && commit_message+="

$body"
[ -n "$footer" ] && commit_message+="

$footer"

# Confirmar mensaje
echo ""
echo "📦 Commit que se va a ejecutar:"
echo "--------------------------------------------------"
echo "$commit_message"
echo "--------------------------------------------------"
read -p "¿Desea continuar? (s/n): " confirm
[[ "$confirm" =~ ^[Ss]$ ]] || exit 0

# Ejecutar git
git add .
git commit -m "$commit_message"
git push
git log --oneline --graph --decorate -n 5
